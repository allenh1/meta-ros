# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages used for 2D-Navigation."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/kinetic/nav2d_msgs/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1a67941b16c9fc9d2f4c3e7fb84f1b0c"
SRC_URI[sha256sum] = "d1aa144fc6c36368221cbb9d59c647bf6d52e4133fc9ba966c8a596a07a4e596"
S = "${WORKDIR}/navigation_2d-release-release-kinetic-nav2d_msgs-0.3.2-0"

inherit catkin

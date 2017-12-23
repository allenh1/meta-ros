# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "mavros_msgs defines messages for ."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3 & LGPL-3 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native geographic-msgs geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/kinetic/mavros_msgs/0.22.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2c2478fb0b053ec6c3c5b72f5901802e"
SRC_URI[sha256sum] = "5eb24f58b86ca22ee4b4067b356cf7574d65155816373474983787e8acf5a72a"
S = "${WORKDIR}/mavros-release-release-kinetic-mavros_msgs-0.22.0-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_nav_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geographic-msgs geometry-msgs marti-common-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/kinetic/marti_nav_msgs/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6130d33a4a440ff059343cb41a4ebd19"
SRC_URI[sha256sum] = "6ba20010ac4eca7eb909456642231520d6ec916e1ca7bb5ebaa268bcb02ce066"
S = "${WORKDIR}/marti_messages-release-release-kinetic-marti_nav_msgs-0.4.0-0"

inherit catkin

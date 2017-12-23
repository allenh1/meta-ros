# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Message defined in the BRICS project"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/wnowak/brics_actuator-release/archive/release/kinetic/brics_actuator/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b2065df5c755608fdb25aab604d19de7"
SRC_URI[sha256sum] = "03ca7dd20b0b7f3316887a13bdff4a00ea648252cfe33e9a71ac4268193a2c04"
S = "${WORKDIR}/brics_actuator-release-release-kinetic-brics_actuator-0.7.0-0"

inherit catkin

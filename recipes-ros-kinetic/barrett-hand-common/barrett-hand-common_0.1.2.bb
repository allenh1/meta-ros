# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The barrett hand common metapackage contains all the common packages for the Bar"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "barrett-hand-description catkin-native"
SRC_URI = "https://github.com/RobotnikAutomation/barrett_hand_common-release/archive/release/kinetic/barrett_hand_common/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "395ecf635dbd7e5d16bbdf8f0a93dfd2"
SRC_URI[sha256sum] = "5aca04bf7671298e0ad13194d30283bfd44557101cb7c303711e3083465fde79"
S = "${WORKDIR}/barrett_hand_common-release-release-kinetic-barrett_hand_common-0.1.2-0"

inherit catkin

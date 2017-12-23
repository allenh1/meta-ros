# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rb1_base_common package. It contains rb1 base common packages used for robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rb1-base-description rb1-base-pad"
SRC_URI = "https://github.com/RobotnikAutomation/rb1_base_common-release/archive/release/kinetic/rb1_base_common/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "942d3cf64708fffa470d780ac6fb0903"
SRC_URI[sha256sum] = "f26852f93bf26b4d270a15d4d2f3b67ac6739792855c1cfc9d93cb81071c4c72"
S = "${WORKDIR}/rb1_base_common-release-release-kinetic-rb1_base_common-1.1.0-0"

inherit catkin

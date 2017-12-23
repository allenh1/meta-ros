# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The manipulator_h_gazebo package     This package provides GAZEBO simulation env"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-MANIPULATOR-H-release/archive/release/kinetic/manipulator_h_gazebo/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5bf0b3fc807fccce07ffbc24219ef933"
SRC_URI[sha256sum] = "e72e354e8927c860d38e0cce49bab4321dd86d087025247baf78fba9beee3843"
S = "${WORKDIR}/ROBOTIS-MANIPULATOR-H-release-release-kinetic-manipulator_h_gazebo-0.2.3-0"

inherit catkin

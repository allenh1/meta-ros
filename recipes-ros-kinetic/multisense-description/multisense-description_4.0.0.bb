# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "multisense_description"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/carnegieroboticsllc/multisense_ros-release/archive/release/kinetic/multisense_description/4.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cbbac9a82fabaf59943a71bdffd76867"
SRC_URI[sha256sum] = "fab6e144848562329bfedeabaf11947027389fa0d1045f4c2da778772a8b8ebb"
S = "${WORKDIR}/multisense_ros-release-release-kinetic-multisense_description-4.0.0-0"

inherit catkin

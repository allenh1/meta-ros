# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the description (mechanical, kinematic, visual,   etc.) of"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native gazebo-ros xacro"
SRC_URI = "https://github.com/ipa320/schunk_modular_robotics-release/archive/release/kinetic/schunk_description/0.6.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cfd2c49621ce4eccc98c1950c62622e7"
SRC_URI[sha256sum] = "661ab246e310cc2a65d870ac99bddb3e2fc337a7e733b20008bf524bcde2ad87"
S = "${WORKDIR}/schunk_modular_robotics-release-release-kinetic-schunk_description-0.6.9-0"

inherit catkin

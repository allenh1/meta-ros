# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The magni_description package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joint-state-publisher robot-state-publisher urdf xacro"
SRC_URI = "https://github.com/UbiquityRobotics-release/magni_robot-release/archive/release/kinetic/magni_description/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "134d287ea1b39f0a81ff3cb8f119f211"
SRC_URI[sha256sum] = "58b77c658c9eca99961f553fc2f3e7840bc5810d131862b6457623de71539341"
S = "${WORKDIR}/magni_robot-release-release-kinetic-magni_description-0.2.1-0"

inherit catkin

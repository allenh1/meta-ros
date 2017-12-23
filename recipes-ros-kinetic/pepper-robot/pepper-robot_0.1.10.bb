# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pepper_robot package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native pepper-bringup pepper-description pepper-sensors-py"
SRC_URI = "https://github.com/ros-naoqi/pepper_robot-release/archive/release/kinetic/pepper_robot/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a82ec0975ab957a65e21dd4be2d9bc2a"
SRC_URI[sha256sum] = "c04062a6eeff1398dd0932c7a5051716a1e16d4ea3610a7057f0231d46293a60"
S = "${WORKDIR}/pepper_robot-release-release-kinetic-pepper_robot-0.1.10-0"

inherit catkin

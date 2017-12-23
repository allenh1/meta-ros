# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pepper_sensors package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native naoqi-sensors-py rospy"
SRC_URI = "https://github.com/ros-naoqi/pepper_robot-release/archive/release/kinetic/pepper_sensors_py/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9e6cf7c7f4cc50c993c4c48989eb266c"
SRC_URI[sha256sum] = "97f2eeb21f132febd2c667003232292fab54ca2877ea246fba7ee7dd384b11fc"
S = "${WORKDIR}/pepper_robot-release-release-kinetic-pepper_sensors_py-0.1.10-0"

inherit catkin

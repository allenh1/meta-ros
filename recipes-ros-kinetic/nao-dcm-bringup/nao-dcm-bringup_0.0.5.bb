# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Bring-up the nao_dcm driver to connect to Aldebaran's Nao robot (v4)."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=30;endline=30;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nao-control naoqi-dcm-driver rospy"
SRC_URI = "https://github.com/ros-naoqi/nao_dcm_robot-release/archive/release/kinetic/nao_dcm_bringup/0.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7832da1cff41b64bc325afb0bc98694f"
SRC_URI[sha256sum] = "60486e8cfdb24d49a67c53d74e174a8bd96a4ac2f4af60df8e1923130eeb5924"
S = "${WORKDIR}/nao_dcm_robot-release-release-kinetic-nao_dcm_bringup-0.0.5-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pepper_bringup package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native naoqi-driver naoqi-driver-py naoqi-pose naoqi-sensors-py pepper-description pepper-sensors-py rgbd-launch"
SRC_URI = "https://github.com/ros-naoqi/pepper_robot-release/archive/release/kinetic/pepper_bringup/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1d7b11e8c31ea878f9efd1b3d689e0cc"
SRC_URI[sha256sum] = "978136b61e085188498f2449928d159a80aec59075ed6acaad4874610f7d52f7"
S = "${WORKDIR}/pepper_robot-release-release-kinetic-pepper_bringup-0.1.10-0"

inherit catkin

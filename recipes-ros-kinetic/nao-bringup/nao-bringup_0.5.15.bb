# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files and scripts needed to bring ROS interfaces for Nao up into a       "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-aggregator nao-description naoqi-driver naoqi-driver-py naoqi-pose naoqi-sensors-py robot-state-publisher"
SRC_URI = "https://github.com/ros-naoqi/nao_robot-release/archive/release/kinetic/nao_bringup/0.5.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ec6b8110b5f3a89f6248a6f2c74edd79"
SRC_URI[sha256sum] = "3aafd40278ac6fbda007f8b64b1c167d1545db89798de3f03ad789dcf5e523b4"
S = "${WORKDIR}/nao_robot-release-release-kinetic-nao_bringup-0.5.15-0"

inherit catkin

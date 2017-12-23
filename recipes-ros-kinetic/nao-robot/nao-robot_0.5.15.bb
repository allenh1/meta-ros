# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nao-apps nao-bringup nao-description"
SRC_URI = "https://github.com/ros-naoqi/nao_robot-release/archive/release/kinetic/nao_robot/0.5.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0fe20db081f8fc99461c621dc0093fbc"
SRC_URI[sha256sum] = "10a8b3c97e8d2ca7bcd19bb914b28adda7ca7548df448e239958645cf69dd3eb"
S = "${WORKDIR}/nao_robot-release-release-kinetic-nao_robot-0.5.15-0"

inherit catkin

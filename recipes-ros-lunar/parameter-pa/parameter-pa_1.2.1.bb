# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ProAut parameter package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native catkin cmake-modules eigen message-generation message-runtime roscpp roslib"
SRC_URI = "https://github.com/peterweissig/ros_parameter-release/archive/release/lunar/parameter_pa/1.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "03b9f88a3a69c15b52ad97ae65ff1a86"
SRC_URI[sha256sum] = "032c38e7180a4ea2671925130753c8fe2515d21611e46701fa80e959034bda9d"
S = "${WORKDIR}/ros_parameter-release-release-lunar-parameter_pa-1.2.1-0"

inherit catkin

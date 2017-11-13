# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ProAut parameter package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules eigen roscpp roslib"
SRC_URI = "https://github.com/peterweissig/ros_parameter-release/archive/release/lunar/parameter_pa/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4d196a281cb0fd5b096846a889ab77e3"
SRC_URI[sha256sum] = "20c8d98559dca44bd726fe22a94a99c968f85e0c0a4e9c25ee5ab0019057de94"
S = "${WORKDIR}/ros_parameter-release-release-lunar-parameter_pa-1.1.0-0"

inherit catkin

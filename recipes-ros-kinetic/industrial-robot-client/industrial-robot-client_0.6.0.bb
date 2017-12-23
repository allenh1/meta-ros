# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "industrial robot client contains generic clients for connecting       to industr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native control-msgs industrial-msgs industrial-utils roscpp sensor-msgs simple-message std-msgs trajectory-msgs urdf"
SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/kinetic/industrial_robot_client/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5d567976b5b39936bf12fd8d769ab4f2"
SRC_URI[sha256sum] = "341ba1ab65d41838e9ffbdc00aaae1cb0042851a36098354e068ce0488bec1d0"
S = "${WORKDIR}/industrial_core-release-release-kinetic-industrial_robot_client-0.6.0-0"

inherit catkin

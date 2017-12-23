# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains visualization tools for Franka Emika."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native libfranka roscpp sensor-msgs xacro"
SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/kinetic/franka_visualization/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "65d8b8a5ac8a32db08487c2428acde43"
SRC_URI[sha256sum] = "4931ba67d552e09711284e2b73e20ce5cbee3582db6fb633258db849930c683e"
S = "${WORKDIR}/franka_ros-release-release-kinetic-franka_visualization-0.1.2-0"

inherit catkin

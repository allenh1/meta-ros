# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides ROS specific hooks for stage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native geometry-msgs nav-msgs roscpp rostest sensor-msgs stage std-msgs std-srvs tf"
SRC_URI = "https://github.com/ros-gbp/stage_ros-release/archive/release/kinetic/stage_ros/1.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "661bc6fa4325bde31b66269a2fb81ebf"
SRC_URI[sha256sum] = "aa282c245ee3f4c0ac0fb9d169f3f5c3c7dbb9ff5d57fe7c69eeec88c2fe4e9f"
S = "${WORKDIR}/stage_ros-release-release-kinetic-stage_ros-1.7.5-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides ROS specific hooks for stage"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native catkin geometry-msgs nav-msgs roscpp rostest sensor-msgs stage std-msgs std-srvs tf"
SRC_URI = "https://github.com/ros-gbp/stage_ros-release/archive/release/lunar/stage_ros/1.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4d4ce24144da42565ecd645df3999403"
SRC_URI[sha256sum] = "01b33012f5130a01635991e691effa5df4f70a144e4f4edcc652531e8cb0ef22"
S = "${WORKDIR}/stage_ros-release-release-lunar-stage_ros-1.8.0-0"

inherit catkin

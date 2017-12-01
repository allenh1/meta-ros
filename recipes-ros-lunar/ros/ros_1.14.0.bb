# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS packaging system"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native mk rosbash rosboost-cfg rosbuild rosclean roscreate roslang roslib rosmake rosunit"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/ros/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2c6be786044a7aecc4358eb6e94062c0"
SRC_URI[sha256sum] = "26da359fe112b76f0e7ccb819bf234321f5a0723abf575efb7c46d761a9ac93e"
S = "${WORKDIR}/ros-release-release-lunar-ros-1.14.0-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS packaging system"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=399805dc4ea4237ed8ff1244c7b3c0f1"

DEPENDS = "catkin mk rosbash rosboost_cfg rosbuild rosclean roscreate roslang roslib rosmake rosunit"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/ros/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2c6be786044a7aecc4358eb6e94062c0"
SRC_URI[sha256sum] = "26da359fe112b76f0e7ccb819bf234321f5a0723abf575efb7c46d761a9ac93e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

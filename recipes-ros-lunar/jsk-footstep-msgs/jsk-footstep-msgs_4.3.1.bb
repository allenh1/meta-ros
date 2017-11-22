# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_footstep_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin geometry-msgs message-generation message-runtime"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/lunar/jsk_footstep_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7bab9e1f577eab6e2c0bb2966d754a84"
SRC_URI[sha256sum] = "827ed4122b6c59541fe53b4904108d8ff5ef67d3162324187a3d7f2364f3c7bc"
S = "${WORKDIR}/jsk_common_msgs-release-release-lunar-jsk_footstep_msgs-4.3.1-0"

inherit catkin

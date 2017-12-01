# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roswtf is a tool for diagnosing issues with a running ROS system. Think of it as"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-paramiko python-rospkg rosbuild rosgraph roslaunch roslib rosnode rosservice rostest"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/roswtf/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "284615f61d5de548d1b241f0618b56ce"
SRC_URI[sha256sum] = "d29ab5719ef2059d733d5cd41b21db952433167d4dad92899cdfa2c0605778fa"
S = "${WORKDIR}/ros_comm-release-release-lunar-roswtf-1.13.5-0"

inherit catkin

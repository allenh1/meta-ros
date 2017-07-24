# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roswtf is a tool for diagnosing issues with a running ROS system. Think of it as"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin python-paramiko python-rospkg rosbuild rosgraph roslaunch roslib rosnode rosservice rostest"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/roswtf/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fb313cf59b3b4c6a165e07bbfe7bf91c"
SRC_URI[sha256sum] = "0c25c84583a8737b33ba8c409b6674ad9582ed32f71914dd3a19fbbee0ad272a"
S = "${WORKDIR}/ros_comm-release-release-lunar-roswtf-1.13.0-0"

inherit catkin

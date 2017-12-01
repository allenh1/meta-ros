# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rospy is a pure Python client library for ROS. The rospy client     API enables "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genpy python-numpy python-rospkg python-pyyaml roscpp rosgraph rosgraph-msgs roslib std-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/${PN}/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c6db23a9b66c1de040de78fcd092b3e5"
SRC_URI[sha256sum] = "67429efdb2dfc902fd48a1d587f48e414adda0f9a6bf372a2ca8ad364a88b960"
S = "${WORKDIR}/ros_comm-release-release-lunar-${PN}-1.13.5-0"

inherit catkin

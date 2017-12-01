# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This is a set of tools for recording from and playing back to ROS     topics.  I"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cpp-common genmsg genpy python-imaging python-rospkg rosbag-storage rosconsole roscpp roscpp-serialization roslib rospy std-srvs topic-tools xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/${PN}/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5507df01fd1b80dba7a74f070b4cae52"
SRC_URI[sha256sum] = "d8f374ed376e65b14bd94b28d5b5ea740ebc0ac3d3443d44cce8e5cd4894b8d9"
S = "${WORKDIR}/ros_comm-release-release-lunar-${PN}-1.13.5-0"

inherit catkin

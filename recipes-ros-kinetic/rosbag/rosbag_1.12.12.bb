# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This is a set of tools for recording from and playing back to ROS     topics.  I"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cpp-common genmsg genpy python-imaging python-rospkg rosbag-storage rosconsole roscpp roscpp-serialization roslib rospy std-srvs topic-tools xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/kinetic/${PN}/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3d5e9aedcf19ab1ca80fef99a6d08b92"
SRC_URI[sha256sum] = "d1324f5d8718bc34a66a6114d4340d15e8fc04d62fb42d8addd07e2cbf8e7422"
S = "${WORKDIR}/ros_comm-release-release-kinetic-${PN}-1.12.12-0"

inherit catkin

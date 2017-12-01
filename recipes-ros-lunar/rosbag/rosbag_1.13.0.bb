# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This is a set of tools for recording from and playing back to ROS     topics.  I"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cpp-common genmsg genpy python-imaging python-rospkg rosbag-storage rosconsole roscpp roscpp-serialization roslib rospy std-srvs topic-tools xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosbag/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6cf3d6c1f3979a2cb9291ce6bb190597"
SRC_URI[sha256sum] = "dd07070f1660817e4abacf7e44f7b20409f15e1014e1cdaf74e8a7ebf953d731"
S = "${WORKDIR}/ros_comm-release-release-lunar-rosbag-1.13.0-0"

inherit catkin

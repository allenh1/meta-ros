# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rospy is a pure Python client library for ROS. The rospy client
    API enables "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=a823eedf9fe759bb382a209e280659f1"

DEPENDS = "catkin genpy python-numpy python-rospkg python-yaml roscpp rosgraph rosgraph_msgs roslib std_msgs"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rospy/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bbc859c0638669212940ac23edb52d54"
SRC_URI[sha256sum] = "7fbe96b20034262379e199f5be7aed09212ca02ce8be5c9edab854b63b2d8f53"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

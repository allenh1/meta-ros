# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rospy is a pure Python client library for ROS. The rospy client     API enables "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genpy python-numpy python-rospkg python-pyyaml roscpp rosgraph rosgraph-msgs roslib std-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/kinetic/${PN}/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "58fe51b693a478472c6d82d66e3907ee"
SRC_URI[sha256sum] = "b1249d76b717e8ba88f6032caea1f2fcc7cf77963d68958e3c158630821eb2a9"
S = "${WORKDIR}/ros_comm-release-release-kinetic-${PN}-1.12.12-0"

inherit catkin

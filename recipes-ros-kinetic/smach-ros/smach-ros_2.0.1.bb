# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The smach_ros package contains extensions for the SMACH library to     integrate"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native rospy rostest rostopic smach smach-msgs std-msgs std-srvs"
SRC_URI = "https://github.com/ros-gbp/executive_smach-release/archive/release/kinetic/smach_ros/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d08462ea25533d84948537d595fad9b9"
SRC_URI[sha256sum] = "c8335753bfb9ae2df4558961578a63f9c5ecd277d1ed548fb174369664030e61"
S = "${WORKDIR}/executive_smach-release-release-kinetic-smach_ros-2.0.1-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The smach_ros package contains extensions for the SMACH library to     integrate"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib actionlib-msgs catkin rospy rostest rostopic smach smach-msgs std-msgs std-srvs"
SRC_URI = "https://github.com/ros-gbp/executive_smach-release/archive/release/lunar/smach_ros/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "562c1fbc6fa5863c08df79ed0e63014d"
SRC_URI[sha256sum] = "7725cb005e7f08520fd64bbe78d441192bb1b7980ae85a7fa54dcd42f594f038"
S = "${WORKDIR}/executive_smach-release-release-lunar-smach_ros-2.0.1-0"

inherit catkin

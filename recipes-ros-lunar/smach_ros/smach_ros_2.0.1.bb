# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The smach_ros package contains extensions for the SMACH library to
    integrate"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=0d7be5cbf1fbdf496ecf7e6f274b4003"

DEPENDS = "actionlib actionlib_msgs catkin rospy rostest rostopic smach smach_msgs std_msgs std_srvs"
SRC_URI = "https://github.com/ros-gbp/executive_smach-release/archive/release/lunar/smach_ros/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "562c1fbc6fa5863c08df79ed0e63014d"
SRC_URI[sha256sum] = "7725cb005e7f08520fd64bbe78d441192bb1b7980ae85a7fa54dcd42f594f038"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS communications-related packages, including core client libraries (roscpp, ro"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin message_filters ros rosbag rosconsole roscpp rosgraph rosgraph_msgs roslaunch roslisp rosmaster rosmsg rosnode rosout rosparam rospy rosservice rostest rostopic roswtf std_srvs topic_tools xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/ros_comm/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "60ebb71bc90c6eed71da130be5df4f1c"
SRC_URI[sha256sum] = "c3aeaa5e8ba820bb34894e075779348d70c17dfcb81c30c29fba2e675834a797"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-paramiko python-rospkg rosbuild rosgraph roslaunch roslib rosnode rosservice rostest"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/roswtf/1.13.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fb313cf59b3b4c6a165e07bbfe7bf91c"
SRC_URI[sha256sum] = "0c25c84583a8737b33ba8c409b6674ad9582ed32f71914dd3a19fbbee0ad272a"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

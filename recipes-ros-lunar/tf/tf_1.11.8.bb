# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=18;endline=18;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "angles catkin geometry_msgs graphviz message_filters message_generation message_runtime rosconsole roscpp rostest roswtf sensor_msgs std_msgs tf2 tf2_ros"
SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/lunar/tf/1.11.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bb9804138fddd6365469d8f7ba932fe9"
SRC_URI[sha256sum] = "67961bde93dd205672dc03de1706146af06e2bc8c9bdf03c1217fc4a825dda21"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

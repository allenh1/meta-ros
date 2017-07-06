# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib_msgs catkin geometry_msgs message_generation message_runtime sensor_msgs shape_msgs std_msgs"
SRC_URI = "https://github.com/ros-gbp/object_recognition_msgs-release/archive/release/lunar/object_recognition_msgs/0.4.1-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "18b2d32fce1978cfa157df0b8943e1c6"
SRC_URI[sha256sum] = "acbf1a2850fae533f454dd9371dfaf59780e8779a49245faf88ead3893444211"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

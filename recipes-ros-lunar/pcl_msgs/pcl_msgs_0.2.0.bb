# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing PCL (Point Cloud Library)-related ROS messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin message_generation message_runtime sensor_msgs std_msgs"
SRC_URI = "https://github.com/ros-gbp/pcl_msgs-release/archive/release/lunar/pcl_msgs/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6e5faef65321ab7f2a0e12ffae5d5ae6"
SRC_URI[sha256sum] = "c6a04460072f600d051611fc35c4c65a096b3b9c03ccfc7e19b9deaad28c812e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

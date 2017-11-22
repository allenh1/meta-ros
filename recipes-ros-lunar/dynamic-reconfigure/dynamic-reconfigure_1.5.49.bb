# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This unary stack contains the dynamic_reconfigure package which provides a means"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin message-generation message-runtime roscpp roscpp-serialization roslib rospy rosservice rostest std-msgs"
SRC_URI = "https://github.com/ros-gbp/dynamic_reconfigure-release/archive/release/lunar/dynamic_reconfigure/1.5.49-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "046b91fa9ca1cfcd1767ba68368f3eff"
SRC_URI[sha256sum] = "a8deb9f9b0b7486b1979557adbc96fae7de91f5106a2d3460eb61d808523b235"
S = "${WORKDIR}/dynamic_reconfigure-release-release-lunar-dynamic_reconfigure-1.5.49-0"

inherit catkin

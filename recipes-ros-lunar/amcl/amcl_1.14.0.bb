# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=c168e59d2bd77073f078137ac2ad9134"

DEPENDS = "catkin dynamic_reconfigure message_filters nav_msgs rosbag roscpp rostest std_srvs tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/amcl/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "394f34809182b91b257fc94770fa2ad9"
SRC_URI[sha256sum] = "000c8ca8526ac126fb93ca6bcb3f24c94f062e6ec40c6308e3d641ab6d1fb579"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

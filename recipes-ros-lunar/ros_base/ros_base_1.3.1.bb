# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage which extends ros_core and includes other basic non-robot tools li"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=e5bed6f78d40c1d4c17c82ca61803931"

DEPENDS = "actionlib bond_core catkin class_loader dynamic_reconfigure nodelet_core pluginlib ros_core"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/lunar/ros_base/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8cd3464c73359c2b4af12805e72335ea"
SRC_URI[sha256sum] = "2f8a07e4481831e850602d7bde61cea54d558e068ff203d06d5e4070dceb735e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

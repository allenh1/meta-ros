# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Core libraries used by MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=292ccc7c09aa30f8677600c2c72e36d8"

DEPENDS = "assimp boost catkin eigen eigen_conversions eigen_stl_containers geometric_shapes geometry_msgs kdl_parser libconsole-bridge-dev libfcl-dev liburdfdom-dev liburdfdom-headers-dev moveit_msgs octomap octomap_msgs pkg-config random_numbers roslib rostime sensor_msgs shape_msgs srdfdom std_msgs trajectory_msgs urdf visualization_msgs"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_core/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e2a2507fbef11c106c09e8ee5c8a1efd"
SRC_URI[sha256sum] = "4a3defb3595580a67beb1bb0a854dde1a78642ad66614adff1f50fffa3c5dba1"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

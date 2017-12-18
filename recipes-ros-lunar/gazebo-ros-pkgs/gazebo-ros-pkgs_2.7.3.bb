# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface for using ROS with the  simulator."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=8caad55b0e7a31e039fbcff07dba789e"

DEPENDS = "catkin-native catkin gazebo-dev gazebo-msgs gazebo-plugins gazebo-ros"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/lunar/gazebo_ros_pkgs/2.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "39f3945cf222c3261c1420b1df8fee0b"
SRC_URI[sha256sum] = "0e40d4dba7034e74a69860902dbb2f658e1bd2739a9d6a049195386e685b1e25"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-lunar-gazebo_ros_pkgs-2.7.3-0"

inherit catkin

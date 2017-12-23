# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapacakge that installs all available planners for MoveIt"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin moveit-planners-ompl"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_planners/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c77e30dc04d971af8d13ec72628cf996"
SRC_URI[sha256sum] = "0ac1358be53fea98978a617c117993c2c5e8f168e82888d9f0a9887899564087"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_planners-0.9.10-0"

inherit catkin

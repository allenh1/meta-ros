# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package for the Nao robot, providing access to NAOqi vision proxies"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs nao-interaction-msgs roslaunch rospy std-msgs std-srvs"
SRC_URI = "https://github.com/ros-naoqi/nao_interaction-release/archive/release/kinetic/nao_vision/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "392249673a5b0e9d45d38865c4cda45b"
SRC_URI[sha256sum] = "35227f5f2a3c4efd567378bf3929386a04a6f9a3660a6a1ec4f003c4df9e3eca"
S = "${WORKDIR}/nao_interaction-release-release-kinetic-nao_vision-0.1.5-0"

inherit catkin

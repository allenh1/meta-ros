# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This ROS package wraps documentation tools like doxygen, sphinx,     and epydoc,"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native doxygen epydoc genmsg python-catkin-pkg-native python-kitchen python-rospkg python-sphinx python-pyyaml"
SRC_URI = "https://github.com/ros-gbp/rosdoc_lite-release/archive/release/kinetic/rosdoc_lite/0.2.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a1a140e775a372e4cebdb0f7deddf1e9"
SRC_URI[sha256sum] = "07d51b973b9b2b200caad843b35d44e86f47b0e3f5477c1d8ad28b8884ef5b26"
S = "${WORKDIR}/rosdoc_lite-release-release-kinetic-rosdoc_lite-0.2.7-0"

inherit catkin

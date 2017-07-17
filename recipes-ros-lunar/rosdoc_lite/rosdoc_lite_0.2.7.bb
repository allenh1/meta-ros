# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This ROS package wraps documentation tools like doxygen, sphinx,
    and epydoc,"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin doxygen epydoc genmsg python-catkin-pkg python-kitchen python-rospkg python-sphinx python-yaml"
SRC_URI = "https://github.com/ros-gbp/rosdoc_lite-release/archive/release/lunar/rosdoc_lite/0.2.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "60f7dc1a1bbdaab7492745fb35e33b24"
SRC_URI[sha256sum] = "8a3f7def87d0262481bae85b5e1a0a34d927918abdc59928dca55a89f8d4b143"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

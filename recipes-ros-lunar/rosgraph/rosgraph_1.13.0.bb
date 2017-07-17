# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosgraph contains the rosgraph command-line tool, which prints
    information a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=92f5b3d15bd26b5bc9c59f0f63453fab"

DEPENDS = "catkin python-netifaces python-rospkg"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosgraph/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9a0b53248c0d684aed8e84a5faf93a0d"
SRC_URI[sha256sum] = "dd070c4ddb7a0b1a5a7f1398539ca4e83388dd7b2d72cf3f67112db0a863be60"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

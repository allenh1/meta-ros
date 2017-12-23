# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "laser_proc"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nodelet pluginlib rosconsole roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/laser_proc-release/archive/release/kinetic/laser_proc/0.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ea547f0267cd0a45c7ea49c1419b4506"
SRC_URI[sha256sum] = "01f0f5a591192e3eff9f65c39649879b2d4adecf4c1985fa24ebd440c96b31b1"
S = "${WORKDIR}/laser_proc-release-release-kinetic-laser_proc-0.1.4-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The jsk_footstep_controller package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs diagnostic-updater dynamic-reconfigure genmsg geometry-msgs jsk-footstep-msgs jsk-footstep-planner jsk-pcl-ros jsk-topic-tools kdl-conversions kdl-parser message-filters message-generation sensor-msgs sound-play std-msgs tf tf2 tf-conversions urdf"
SRC_URI = "https://github.com/tork-a/jsk_control-release/archive/release/kinetic/jsk_footstep_controller/0.1.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7487543656ae9e600e9101312b7dbb25"
SRC_URI[sha256sum] = "ef8369cce6224382e77d9a0fa0e46c587725b4e028ecabcecba5ce69b4708599"
S = "${WORKDIR}/jsk_control-release-release-kinetic-jsk_footstep_controller-0.1.13-0"

inherit catkin

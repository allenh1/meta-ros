# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Theora_image_transport provides a plugin to image_transport for
    transparentl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=662b90d32c2407c1448859c657797890"

DEPENDS = "catkin cv_bridge dynamic_reconfigure image_transport libogg libtheora message_generation message_runtime pluginlib rosbag std_msgs"
SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/lunar/theora_image_transport/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2e05af164645c1f907ee51eef020fe46"
SRC_URI[sha256sum] = "f3a0b2741eae0196173162705d442e4d6715c0ba544335e8e9c90cab74cffcac"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

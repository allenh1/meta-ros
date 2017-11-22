# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3D visualization tool for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp assimp-dev catkin cmake-modules eigen geometry-msgs image-transport interactive-markers laser-geometry libogre-dev libqt5-core libqt5-gui libqt5-opengl libqt5-opengl-dev libqt5-widgets liburdfdom-headers-dev map-msgs media-export message-filters nav-msgs opengl pluginlib python-qt-binding qtbase5-dev resource-retriever rosbag rosconsole roscpp roslib rospy sensor-msgs std-msgs std-srvs tf libtinyxml urdf visualization-msgs yaml-cpp"
SRC_URI = "https://github.com/ros-gbp/rviz-release/archive/release/lunar/rviz/1.12.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0ee8ae231cf4530c9c30b9be60187e2c"
SRC_URI[sha256sum] = "ab03649cb621011e23bcf1078b29fba0cacc8f638e96aa312ebfe16901b75dc9"
S = "${WORKDIR}/rviz-release-release-lunar-rviz-1.12.13-0"

inherit catkin
